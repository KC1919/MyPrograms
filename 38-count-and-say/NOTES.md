count++;
}
//if the character is different
else{
//so we append the count with the character the start character
sb.append(count+""+sc);
//reset the count to 1
count=1;
//and update the start character to the current jth character
sc=ch;
}
}
//to store the result for the last character or any string which of
//length=1
sb.append(count+""+sc);
//store the result of the nth term in the hashmap
hm.put(i,sb.toString());
}
//return the nth term result
return hm.get(n);
}