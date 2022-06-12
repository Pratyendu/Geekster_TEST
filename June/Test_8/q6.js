// Q. Find the nth largest element in a sorted array
//Sol:

let sortedArray = [1, 4, 6, 8, 10, 16, 19];
let n = parseInt(prompt("Enter the nth largest element you want to find:"));
function nthLargestElement(sortedArray) {
  while (n <= sortedArray.length) {
    let indexOfNthLargestElement = n - 1;
    console.log(
      "The nth largest element is:",
      sortedArray[indexOfNthLargestElement]
    );
  }
}
nthLargestElement(sortedArray);
