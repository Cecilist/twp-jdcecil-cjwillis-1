# To Do list
- Copy JSON data for pizza wikipedia page to a test resource file. Write a learning
test to ensure we can read the name of the first revision author from test data.
  
- Make RevisionParser class, test its parse method so that given an input stream, return the
name of the first revision author. 
  
- Refactor RevisionParser so parser return a revision object, not simply a string. 

- Redesign RevisionParser's parse method to return a List<Revision> containing all the
revisions in the stream.
  
- Make a RevisionFormatter class that takes a Revision and produces an output string 
appropriate for printing, following the given functional requirements 
  
- Create a command line application that gets input, hands input off to other modules,
gets results and prints as appropriate. 
  
- Modify proper timestamp strings to proper variable for timestamps

--------------
- Implement error codes as described by functional requirements.

- Implement notice to user if wikipedia article given doesn't exactly match input (redirect)

- Reformat tests
