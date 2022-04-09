The intuition behind this approach is that,
​
**Variables and DS**
* DP array to store the result of the nodes and use it for intermediate results.
* visited array to mark the status of the visited and unvisited node.
​
*First we mark the terminal nodes in the dp array.*
​
We start from the 0th node. i.e the first node.
​
We *run a loop to all the neighbours of the current node*,**** if we see a neighbour is visited already, that means its a cycle so we simply return false****. Means only terminal path is not possible.
​
So we *explore all the paths possible from the src node* and i**f we get false from any of the path, it means our result is false. and all the paths starting from current node dont end at terminal node.**
​
So we do same for all the nodes.
​
*Hum apne saare neighbours se ans puchte hai, ki unke aage se hum terminal node pe pohch skte hai ya ni.
*
**Agar wo saare path true ans dete hai,** **to mtlb hum apne node se terminal node pohch skte hai toh hum apna result dp array mein 1 store kradete hai**.(1 mtlb true and 0 mtlb false).
​
*Par agr ek bhi neighbour se false ata hai toh humra result bhi false hojata hai, toh hum dp array mein apna answer 0 daldete hai.*
​
Dp array time bchata hai, kyunki koi node agar 2 logo ka neigbour hai.
​
Toh ye node phle phle call hochuka hai toh is node ne apna answer calculate krliya hoga.
​
Toh agar isko koi dusra node firse call krta hai, to ye dubara apna answer calculate krne ki jgh dp array se return krdeta hai. Isse time bchta hai.
​