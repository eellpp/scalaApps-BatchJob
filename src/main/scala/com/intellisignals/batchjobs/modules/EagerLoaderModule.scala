package com.intellisignals.batchjobs.modules

import com.google.inject.AbstractModule
import com.intellisignals.batchjobs.jobs.TestJob
import com.typesafe.config.ConfigFactory

class EagerLoaderModule extends AbstractModule{
  override def configure() = {
    val values = ConfigFactory.load().getStringList("job.run")


    values.forEach(item => item match {
      case "test.job" => bind(classOf[TestJob]).asEagerSingleton()
      case _ => println("No Jobs found")
    })

  }
}
