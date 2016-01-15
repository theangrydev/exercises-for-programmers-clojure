(ns exercises-for-programmers-clojure.ex01_saying_hello_test
  (:require
    [exercises-for-programmers-clojure.ex01_saying_hello :refer :all]
    [midje.sweet :refer :all]))

(fact
  "greeting greets the user"
  (-main) => nil
  (provided
    (print "What is your name? ") => nil :times 1
    (read-line) => "Liam"
    (print "Hello, Liam, nice to meet you!\n") => nil :times 1))