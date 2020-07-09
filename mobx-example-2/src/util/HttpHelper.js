export function fetchToDos() {
  // normally would make a call to the server
  return [
    { description: "coach", isDone: true },
    { description: "work", isDone: true },
    { description: "drink beer", isDone: false },
  ];
}
