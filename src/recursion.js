function reverse(str){
  return str.length < 2 ? str : reverse(str.slice(1)) + str.charAt(0)
}

function palindrome(str){
  if(str.length < 2){
   return true; 
  }
  if(str.slice(0,1) === str.slice(str.length-1)){
    return palindrome(str.slice(1,-1))
  }
  return false;
}

function a_power_b(a,b){
  return b === 1 ? a : a_power_b(a,b-1) * a;
}

function my_map([head, ...tail], mapFn){
  if(head === undefined){
    return []
  }
  return [mapFn(head), ...my_map(tail, mapFn)]
}

function my_filter([head, ...tail], filterFn){
  if(head === undefined){
    return []
  }
  return [...(filterFn(head) ? [head] : []), ...my_filter(tail, filterFn)]
}


console.log(my_filter([1,2,3,4],(n) => n % 2 === 0));
console.log(my_map([1,2,3],(n) => 2 * n));
console.log(a_power_b(3,3))
console.log(palindrome("madam"));
console.log(reverse("prasanna", ""));
