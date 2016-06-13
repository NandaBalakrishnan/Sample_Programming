#include<stdio.h>
#include<malloc.h>
struct queue
{
int ele;
struct queue*next;       
}*front='\0',*rear='\0';
void insert();
void delete();
void display();
int main()
{
int ch;
do
{
printf("1.insert\n2.delete\n3.display\n");
printf("Enter the choice\n");
scanf("%d",&ch);
switch(ch)
{
case 1:
     insert();
     break;
case 2:
     delete();
     break;
case 3:
     display();
     break;                  
}    
}while(ch!=4);
system("pause");
}
void insert()
{
 struct queue*newnode,*q;
 int x;
 newnode=(struct queue*)malloc(sizeof(struct queue));
 printf("Enter the element\n");
 scanf("%d",&x);
 newnode->ele=x;
 if(rear=='\0')
 {
 newnode->next='\0';
 front=newnode;
 rear=newnode;              
 }    
 else
 {
 q=front;
 while(q->next!='\0')
 {
 q=q->next;                    
 }
 q->next=newnode;
 newnode->next='\0';
 rear=newnode;
     
 }
}
void delete()
{
     struct queue*q;
     if(front=='\0')
     {
     printf("queue is empty\n");
     }
     else
     {
     q=front;    
     if(front==rear)
     {
     front='\0';
     rear='\0';               
     }    
     else
     {
      front=front->next;
      printf("element is%d\t",q->ele);
      free(q);   
     }
     }
}
void display()
{
     struct queue*q;

     if(front=='\0')
     printf("queue is empty");
     else
     {
     q=front;
     while(q!='\0')
     {
     printf("%d-->",q->ele);                    
     q=q->next;
     }    
     }
}
