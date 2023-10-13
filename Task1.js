function reverseWords(sentence) {
  // Split the sentence into words
  let words = sentence.split(" ");

  // Iterate through the words, reverse each one, and store them in a new array
  let reversedWords = words.map(function (word) {
    return word.split("").reverse().join("");
  });

  // Join the reversed words to form the final reversed sentence
  let reversedSentence = reversedWords.join(" ");

  return reversedSentence;
}

// Example usage
let inputSentence = "i am pratiksha";
let reversed = reverseWords(inputSentence);

console.log(reversed); // Output: "sihT si a ynnus yad"
