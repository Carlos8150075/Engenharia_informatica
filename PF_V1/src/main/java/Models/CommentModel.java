/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import org.bson.types.ObjectId;

/**
 *
 * @author Bernardo
 */
public class CommentModel {
    public String comment;
    public long timestamp;
    public long time_since_start;
    public ObjectId variable;
    public ObjectId session;

    public CommentModel()
    {

    }

    public CommentModel(String comment, long timestamp, long time_since_start, ObjectId variable, ObjectId session) {
        this.comment = comment;
        this.timestamp = timestamp;
        this.time_since_start = time_since_start;
        this.variable = variable;
        this.session = session;
    }

    @Override
    public String toString() {
        return "Instancia{" +
                "comment=" + comment +
                ", timestamp=" + timestamp +
                ", time_since_start=" + time_since_start +
                ", variable=" + variable +
                ", session=" + session +
                '}';
    }
}
