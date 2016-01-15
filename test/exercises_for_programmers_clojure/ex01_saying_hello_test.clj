(ns exercises-for-programmers-clojure.ex01_saying_hello_test
  (:require
    [exercises-for-programmers-clojure.ex01_saying_hello :refer :all]
    [midje.sweet :refer :all]))

(fact "greeting greets the user"
      (greeting "Liam") => [""]
      )