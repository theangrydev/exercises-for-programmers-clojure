(ns exercises-for-programmers-clojure.ex02_counting_the_number_of_characters)

(defn counter []
  (console/print "What is the input string? ")
  (def input-string (console/read-line))
  (console/print (format "'%s' has %d characters\n" input-string (count input-string))))
