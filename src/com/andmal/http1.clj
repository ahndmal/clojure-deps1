(ns com.andmal.http1
  (:import (com.mashape.unirest.http Unirest)
           (com.mashape.unirest.request.body Body)))

(def resp (Unirest/get "http://example.com"))

(println (.checkCreateClassLoader resp))


