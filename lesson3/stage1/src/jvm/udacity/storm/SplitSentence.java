package udacity.storm;

import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.StormSubmitter;
import backtype.storm.task.ShellBolt;
import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.IRichBolt;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.TopologyBuilder;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;

import java.util.HashMap;
import java.util.Map;


// NOTE - you must install the python Beautiful Soup module in Ubuntu
// before this code will run.  In your virtual machine, run:
//
// sudo apt-get install python-bs4
//
// see Lesson 4 for details on adding this provision to your Vagrantfile

// Lesson 3 Stage 1 is taken from Lesson 2 Stage 6 to provide a basic starting point.
// Copy, paste and uncomment the following resources module in the POM.xml file.
// This defines the src/jvm/udacity/storm/resources location needed for python shell

//<!-- ADDING MAVEN RESOURCES FOR PYTHON SHELL -->
//<resources>
//  <resource>
//    <directory>src/jvm/udacity/storm</directory>
//  </resource>
//</resources>
//<!-- END ADDING MAVEN RESOURCES FOR PYTHON SHELL -->

//
public class SplitSentence extends ShellBolt implements IRichBolt {

    public SplitSentence() {
      super("python", "splitsentence.py");
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
      declarer.declare(new Fields("word"));
    }

    @Override
    public Map<String, Object> getComponentConfiguration() {
      return null;
    }
  }