#include<stdio.h>
#include<string.h>
struct node
{
char ele;
struct node*next;
}*head='\0';
char p[10];
char q[10];
void insert();
void create();
void display();
void reverse();
void compare();
int k=0;
int main()
{
int ch;
do
{
printf("1.create\n2.insert\n3.display\n4.reverse\n5.compare");
printf("Enter the choice\n");
scanf("%d",&ch);
switch(ch)
{
case 1:
     create();
     break;
case 2:               
     insert();
     break;
case 3:
     display();
     break;
case 4:
     reverse();
     break;     
case 5:
     compare();
     break;     
}    
}while(ch!=6);
system("pause");    
}
void insert()
{
char x;
struct node*newnode,*current,*q;
fflush(stdin);
printf("Enter the element\n");
scanf("%c",&x);
newnode=(struct node*)malloc(sizeof(struct node));
newnode->ele=x;
newnode->next='\0';
if(head=='\0')
{
head=newnode;              
current=newnode;
k++;
}
else
{
q=head;
while(q->next!='\0')
{
q=q->next;                                     
}
q->next=newnode;
k++;
}
}
void create()
{
char x;
struct node*newnode,*current;
newnode=(struct node*)malloc(sizeof(struct node));
fflush(stdin);
printf("Enter the element\n");
scanf("%c",&x);
newnode->ele=x;
newnode->next='\0';
if(head=='\0')
{
head=newnode;
current=newnode;              
k++;
}
else
{
current->next=newnode;
current=newnode;
k++;
}     
}
void display()
{
     int l=0;
struct node*i;
i=head;
for(;i!='\0';i=i->next)
{
printf("%c-->",i->ele);
p[l++]=i->ele;
}
p[l++]='\0';
printf("%s",p);
}
void reverse()
{
struct node*i;
int m=0;
     struct node*pre,*current,*temp;
pre=head;
current=pre->next;
pre->next='\0';
while(current!='\0')
{
temp=current->next;
current->next=pre;
pre=current;
current=temp;                    
}
head=pre;
i=head;
for(;i!='\0';i=i->next)
{
printf("%c-->",i->ele);
q[m++]=i->ele;
}
q[m++]='\0';
printf("%s",q);
}

void compare()
{
     int i;
if(strlen(p)==strlen(q))
{
for(i=0;i<strlen(p);i++)
{
if(p[i]==q[i])
continue;
else
printf("not a palindrome");                        
} 
printf("palindrome");                       
}     
else
printf("not a palindrome");
}
