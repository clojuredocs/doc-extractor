(defproject clojuredocs/extractor "0.2.0-SNAPSHOT"
  :description "Survey a clojure project and extract valuable metadata."
  :url "https://github.com/clojuredocs/doc-extractor"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/tools.namespace "0.2.4"]
                 [cheshire "5.2.0"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]]}})
