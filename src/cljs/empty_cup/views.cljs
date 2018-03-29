(ns empty-cup.views
  (:require [re-frame.core :as re-frame]
            [empty-cup.subs :as subs]))

(defn cups-sidebar []
  (let [cups (re-frame/subscribe [::subs/cups])]
    (prn @cups)
    [:div#sidebar-container (if (> (count @cups) 0)
                              [:ul
                               (for [cup @cups]
                                 ^{:key (gensym)}
                                 [:li.cup-list-item (str cup)])]
                              "You have no cups")]))

(defn top-login-bar []
  [:div#top-bar "This is the top-bar"
   [:div#top-bar-content "my content"]])

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div#root-container
     [:div#main-content
      [top-login-bar]
      "Hello from " @name]
     [cups-sidebar]]))

