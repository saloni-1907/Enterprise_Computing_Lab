#WebContent/RegisterCandidate.jsp
      -->It provides an interface to register the candidate.
      -->It accepts candidateId and candidateName as input.
  
#WebContent/RegistrationStatus.jsp  
      --> It displays the message regarding whether the registration of the candidate has been successful or not.

#WebContent/VotingStatus.jsp 
      --> It displays the message regarding whether the student has voted successfully or not.

#WebContent/homePage.jsp 
      --> It acts as a menu bar and provides the user with the following option: "Register Candidate","Vote","Show Winner" And "Poll Summary".The user can choose whatever operation he wishes to perform.

#WebContent/pollSummary.jsp 
      --> It displays the votes that have been received by every registered candidate.

#WebContent/showWinner.jsp 
      -->It displays the winner of the poll.

#WebContent/userVotes.jsp 
      -->It provides an interface to students for voting out of the given registered candidates.
      -->It accepts studentId and shows the list of the registered candidates so that the student can vote one candidate of his choice through radio button.
      
src/com/poll
      -->It has been divided into three components:
            1)Controller: Passes data between the presentation layer and application logic layer.It does not contain any business logic.
            2)Model: It acts as a bean and declares the classes and their variables and methods(getters and setters).
            3)
