//Q. What will be returned if you look for the index of something that does not exist?

var arr = ["a", "b", "c", "d"];
for (let i = 0; i < arr.length; i++) {
  if (arr[i] == "e") {
    console.log(arr[i], "the index of e is ", i);
  }
}

//there is no output in this case
