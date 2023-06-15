(ns com.andmal.jira
  (:import 
    (kong.unirest HttpResponse HttpRequest Unirest Header)
    (java.util Base64) 
  )
  (:require 
    [clojure.string :as str]
    [clojure.data.json :as json]
     )
 )

(println str "Java Version is " (System/getProperty "java.version"))

(def jiraUrl "http://localhost:9600")
(def restUrl "/rest/api/2/issue/")
(def token 
  (.encodeToString 
    (Base64/getEncoder) (.getBytes "admin:admin" ) ) )

(def headers 
  {"Authorization" (str "Basic" token) "Content-Type" "application/json"}
)

(def resp 
  (.basicAuth 
    (.headers 
      (Unirest/get (str jiraUrl restUrl) ) headers) "admin" "admin") )

(def respBody (.getBody (.asString resp) ) )

(def status (.getStatus resp) )

(println respBody)
(println status)

;(def issue (json/read-str respBody) )

;(println issue)
