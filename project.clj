(defproject fenetk "0.1.0-SNAPSHOT"
  :description "A non-sketchy url shortener"
  :url "http://fene.tk/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.0.1"]
                 [compojure "1.0.1"]
                 [enlive "1.0.0"]]
  :main fenetk.app
  :min-lein-version "2.0.0")
