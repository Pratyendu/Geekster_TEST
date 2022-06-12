// Q. Find the index position of b in this array var arr= ['a','b','c','d'];
//Sol:

var arr = ["a", "b", "c", "d"];
function indexOfB(arr) {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] == "b") {
      console.log("The index position of b is ", i);
    }
  }
}
indexOfB(arr);
