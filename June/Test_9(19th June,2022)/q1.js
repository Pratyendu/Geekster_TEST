const input = [1, -5, 2, 10, -30, 29, 50];
let sum = 0;
function sumOfEvenElements() {
  for (i = 0; i < input.length; i++) {
    if (input[i] > 0) {
      sum = sum + input[i];
    }
  }
  console.log('The sum of even elements in array "input" is ', sum, ".");
}
sumOfEvenElements();
