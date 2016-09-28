#include<stdlib.h>
#include<iostream>
#include<string.h>


using namespace std;


struct Bike
{
   int id_num;
   char manufact[25];
};



template <class T>
struct MyTList
{
	int listSize;	//head node keeps size of the list
   T * data;
   T * operator[] (int);
   MyTList * next;

   MyTList * pTail;	//head node keeps pointer to the tail of the list
   MyTList * curr;
};



template<class T>
MyTList<T> * initTList(T * d)
{
	MyTList<T> * p = new MyTList<T>;
	p->data = d;
	p->listSize = 0;
	p->next = 0;

	p->pTail = 0;
	p->curr = p;
	return p;
}

//does not make it more readable or usable in that implementation,
//but gives initial introduction to the operator overloading
template<class T>
T * MyTList<T>::operator[](int i)
{
	return data;
}



template<class T>
MyTList<T> * tnext (MyTList <T>* pHead)
{
        if(!pHead)
            return 0;
	pHead->curr = pHead->curr->next;
	return pHead->curr;
}



template<class T>
MyTList<T> * tend(MyTList<T> * pFirst)
{
	return (!pFirst ? 0 : pFirst->pTail);
}

template<class T>
MyTList<T> * tbegin(MyTList<T> * pFirst)
{
	if(!pFirst)
            return 0;
        pFirst->curr = pFirst; //reset the current pointer
        return pFirst;
}

template<class T>
bool isTEmpty(MyTList<T> * pHead)
{
	if(!pHead)
		return true;
	return false;
}


template<class T>
int sizet(MyTList <T>* pHead)
{
	if(isTEmpty(pHead))
		return 0;
	return pHead->listSize;
}


template<class T>
MyTList<T> * deleteTNode(MyTList<T> *& pHead, MyTList<T> * pCurr)
{
	if(!pHead)
		return 0;
	MyTList<T> * tmp = pHead;
	if(pHead->data == pCurr->data)
	{	//delete head node
		return pop_tfront(pHead);
	}
	else if(pHead->pTail->data == pCurr->data)
	{//delete tail node
		return pop_tback(pHead);
	}
	else
	{//traverse the list
		tmp = pHead;
		while(tmp && tmp->data == pCurr->data)
			tmp = tmp->next;
		if(tmp)
		{
			if(tmp->next)
			{
				tmp->prev->next = tmp->next;
				tmp->next->prev = tmp->prev;
				pHead->listSize--;
				delete tmp;
			}
		}
	}
	return pHead;
}

template<class T>
void deleteTList(MyTList <T> * pFirst)
{
   MyTList<T> * tmp = pFirst;
   MyTList <T>* prev = pFirst;
   while(tmp)
   {
      prev = tmp;
      tmp = tmp->next;
      delete prev->data; //now we can safely delete the data.
	  delete prev;
   }
}

template<class T>
MyTList<T> * push_tback(MyTList<T> * pHead,  MyTList<T> * pCurr)
{
    MyTList<T> * tmp = pHead;
    MyTList<T>* prev = pHead;
    if(!pCurr)
    	return pHead;
    if(!pHead)
    {
       pHead = pCurr;
       pHead->listSize++;
       pHead->pTail = pHead;
       return pHead;
    }
    pHead->listSize++;//Head node keeps size of the list.
    pHead->pTail->next = pCurr;

    pHead->pTail = pCurr;
	return pHead;
}



int main()
{
	MyTList<Bike> * pHead = 0, *pTail = 0, *pCurr = 0;
	Bike * bike  =0;
	int ids [3] = {12,25,35};
	char * names [] = {"BMW", "HONDA", "SUZUKI"};
	for(int i = 0; i < 3; i++)
	{
		if(!(bike = new Bike))
		{
			cout<<"\nERR: something happened";
			return -1;
		}

		bike->id_num = ids[i];
		strcpy(bike->manufact, names[i]);
		pCurr = initTList(bike);
		pHead = push_tback(pHead, pCurr);
	}
	cout<<"\nPrinting list";
	MyTList <Bike>* i = pHead;
	for(; i != tend(pHead); i = tnext(pHead))
	{
		bike = i->data;
//		cout<<"\n"<<bike->manufact;
		cout<<"\nAlso: "<<(*i)[0]->manufact;


	}
//our implementation of the tnext returns second to the last node;
//this means we need to get to the last node after the loop
	if(i == tend(pHead))
	{
		bike = i->data;
		cout<<"\n"<<bike->manufact;
	}
	cout<<"\nCurrent: "<<pHead->curr->data->manufact;

	deleteTList(pHead);
}
