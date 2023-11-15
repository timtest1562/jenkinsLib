#!/usr/bin/env groovy

import groovy.json.*
  
def call(body) {
  def mapVars            = [:]
  body.resolveStrategy   = Closure.DELEGATE_FIRST
  body.delegate          = mapVars
  body()

  def name = maVars.name
  def action = maVars.action
  
  println(action + " " + name + " !!!");
}
