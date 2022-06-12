/* Q. Write a function to check if geekster exists in your array var list = ['geek', 'geekster', 'geeky'];
If it exists  add some code to find the index of geekster and remove that item.*/
//Solution:

var list = ["geek", "geekster", "geeky"];
function findGeekster(list) {
  for (let i = 0; i < list.length; i++) {
    if (list[i] == "geekster") {
      console.log("Geekster exists at index:", i);
      list[i] = list[i + 1];
      list.pop();
      console.log("after removing geekster the array becomes:", list);
    }
  }
}
findGeekster(list);
