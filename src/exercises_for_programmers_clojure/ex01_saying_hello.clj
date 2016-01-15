(ns exercises-for-programmers-clojure.ex01_saying_hello)

(defn -main []
  (print "What is your name? ")
  (printf "Hello, %s, nice to meet you!\n" (read-line)))
