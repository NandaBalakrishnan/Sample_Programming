#include<stdio.h>
#include<malloc.h>
void push();
void pop();
void display();
struct stack
{
int ele;
struct stack*next;       
}*top='\0';
int main()
{
int ch;
do
{
printf("1.push\n2.pop\n3.display\n");
printf("Enter the choice\n");
scanf("%d",&ch);
switch(ch)
{
case 1:
     push();
     break;
case 2:
     pop();
     break;
case 3:
     display();
     break;         
}
}while(ch!=4);
system("pause");    
}
void push()
{
     int x;
struct stack*newnode;     
newnode=(struct stack*)malloc(sizeof(struct stack));
printf("Enter the element\n");
scanf("%d",&x);
newnode->ele=x;
if(top=='\0')
{
newnode->next='\0';
top=newnode;             
}
else
{
newnode->next=top;
top=newnode;
}
}
void pop()
{
struct stack*temp;
if(top=='\0')
{
printf("stack is underflow");
}
else
{
temp=top;
printf("element at top is:%d",temp->ele);
top=top->next;
free(temp);    
}     
}
void display()
{
     struct stack*i;
     for(i=top;i!='\0';i=i->next)
     {
     printf("%d-->",i->ele);                            
     }
     if(top=='\0')
     {
     printf("stack is empty\n");             
     }
}
