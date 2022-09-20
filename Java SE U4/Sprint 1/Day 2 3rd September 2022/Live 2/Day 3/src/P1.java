var counter=0;
var count=0;
for(var i=0;i<arr.length;i++)
{
count=1;
for(var j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
count++;
}
}
if (count % 2 == 0)
{
counter++;
}
}