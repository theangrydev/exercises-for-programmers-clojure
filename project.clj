(defproject exercises-for-programmers-clojure "0.1.0-SNAPSHOT"
  :description "Solutions to 'Exercises for Programmers: 57 Challenges to Develop Your Coding Skills' in Clojure"
  :url "https://github.com/theangrydev/exercises-for-programmers-clojure"
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :profiles {
             :dev {
                   :dependencies [[midje "1.8.3"]]
                   :plugins      [[lein-midje "3.2"]]}})