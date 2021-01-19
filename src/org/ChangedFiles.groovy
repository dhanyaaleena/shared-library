package org

class ChangedFiles{

def thr = Thread.currentThread();
def build = thr?.executable;

def changeSet= build.getChangeSet();

return changeSet.getItems();
}