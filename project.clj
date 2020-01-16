(defproject gluttony "0.1.0-SNAPSHOT"
  :description "A consumer library using core.async and aws-api based on AWS SQS"
  :url "https://github.com/toyokumo/gluttony"
  :license {:name "Apache, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :deploy-repositories [["releases" {:url "https://repo.clojars.org" :creds :gpg}]
                        ["snapshots" :clojars]]
  :plugins [[lein-ancient "0.6.15"]]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/core.async "0.7.559"]
                 [camel-snake-kebab "0.4.1"]
                 [com.cognitect.aws/api "0.8.408"]
                 [com.cognitect.aws/endpoints "1.1.11.705"]
                 [com.cognitect.aws/sqs "770.2.568.0"]]
  :repl-options {:init-ns gluttony.core})