package com.aj.domain;

import com.aj.constants.DailyRoutine;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class MyTask {
  private String taskId;
  private String taskTitle;
  private String eventTime;

  private interface Secret {
    public void shh();
  }

  private class DailyTask implements Secret {
    private final List<Task> taskList = new ArrayList<>();
    private final Instant todayDate = Instant.now();

    public void printAllValue() {
      Task task = new Task();
      System.out.println(task.taskStatus);
      System.out.println(DailyTask.this.todayDate);
      System.out.println(MyTask.this.taskId);
    }

    @Override
    public void shh() {
      System.out.println("Don't Shout!");

      String algo = "";
      class SecretKeyGen {
        private static final String key = "123123";
        private String salt;

        public String applyAlgo() {
          return algo + salt;
        }
      }
    }

    private class Task {
      private String taskStatus;
      private DailyRoutine dailyRoutine;
      private String taskDescription;

      public void printAllValue() {
        System.out.println(this.taskStatus);
        System.out.println(DailyTask.this.todayDate);
        System.out.println(MyTask.this.taskId);
      }
    }
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof MyTask)) {
      return false;
    }
    MyTask other = (MyTask) obj;

    return new EqualsBuilder()
        .appendSuper(super.equals(obj))
        .append(taskId, other.taskId)
        .append(taskTitle, other.taskTitle)
        .isEquals();
  }

  @Override
  public int hashCode() {
    int hash = 7;
    // any  prime number is good to have for hashCode generate for unique Bucket identify
    hash = 31 * hash + (taskId == null ? 0 : taskId.hashCode());
    hash = 31 * hash + (taskTitle == null ? 0 : taskTitle.hashCode());
    return hash;
  }

  abstract class HighPriorityTask {
    abstract DailyRoutine getDailyRoutine();
  }

  public DailyRoutine findHighPriorityTask() {
    HighPriorityTask dd =
        new HighPriorityTask() {
          @Override
          DailyRoutine getDailyRoutine() {
            return DailyRoutine.MORNING;
          }
        };
    return dd.getDailyRoutine();
  }

  interface TaskRank {
    int getRank();
  }

  public int findRank() {
    int demo = 100;
    TaskRank taskRank =
        new TaskRank() {
          @Override
          public int getRank() {
            return 20;
          }
        };
    return demo - taskRank.getRank();
  }

  public static void main(String[] args) {

    MyTask myTask = new MyTask();
    MyTask.DailyTask dailyTask = myTask.new DailyTask();
    dailyTask.printAllValue();
    DailyTask.Task task = dailyTask.new Task();
    task.printAllValue();
  }
}
