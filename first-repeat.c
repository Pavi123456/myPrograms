#include<stdio.h>
int main()
{
    int n,c=0,i,j;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
           if(a[i]==a[j]){
               printf("%d",a[i]);
               c=1;
               goto l;
           }
        }
    }
    l:
    if(c==0)
    printf("UNIQUE");
    
}