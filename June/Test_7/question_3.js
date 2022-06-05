let num = parseInt(prompt("Enter a number!"));
let sum = 0;
for (i = 1; i <= num; i++) {
  if (i % 2 !== 0) {
    console.log(i);
    sum += i;
  }
}
console.log("The sum of odd natural numbers upto " + num + " is " + sum);
