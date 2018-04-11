package com.intellisignals.batchjobs

import com.google.inject.Guice
import com.intellisignals.batchjobs.modules.EagerLoaderModule


object Application {

  def main(args: Array[String]): Unit = {
    Guice.createInjector(new EagerLoaderModule)
  }
}
