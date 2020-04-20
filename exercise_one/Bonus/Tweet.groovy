class Tweet {
  int maxNumberOfChar
  String tweet

  void printTweet(){
   println "$tweet"
  }
}

Tweet t = new Tweet();
t.tweet="This is new tweet"
t.printTweet()
