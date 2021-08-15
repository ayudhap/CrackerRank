
package com.example.crackerrank.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Submission implements Serializable, Parcelable
{

    @SerializedName("language_id")
    @Expose
    private Integer languageId;
    @SerializedName("source_code")
    @Expose
    private String sourceCode;
    @SerializedName("stdin")
    @Expose
    private String stdin;
    public final static Creator<Submission> CREATOR = new Creator<Submission>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Submission createFromParcel(android.os.Parcel in) {
            return new Submission(in);
        }

        public Submission[] newArray(int size) {
            return (new Submission[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8804719419870908570L;

    protected Submission(android.os.Parcel in) {
        this.languageId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.sourceCode = ((String) in.readValue((String.class.getClassLoader())));
        this.stdin = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Submission() {
    }

    /**
     * 
     * @param sourceCode
     * @param stdin
     * @param languageId
     */
    public Submission(Integer languageId, String sourceCode, String stdin) {
        super();
        this.languageId = languageId;
        this.sourceCode = sourceCode;
        this.stdin = stdin;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getStdin() {
        return stdin;
    }

    public void setStdin(String stdin) {
        this.stdin = stdin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Submission.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("languageId");
        sb.append('=');
        sb.append(((this.languageId == null)?"<null>":this.languageId));
        sb.append(',');
        sb.append("sourceCode");
        sb.append('=');
        sb.append(((this.sourceCode == null)?"<null>":this.sourceCode));
        sb.append(',');
        sb.append("stdin");
        sb.append('=');
        sb.append(((this.stdin == null)?"<null>":this.stdin));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.languageId == null)? 0 :this.languageId.hashCode()));
        result = ((result* 31)+((this.sourceCode == null)? 0 :this.sourceCode.hashCode()));
        result = ((result* 31)+((this.stdin == null)? 0 :this.stdin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Submission) == false) {
            return false;
        }
        Submission rhs = ((Submission) other);
        return ((((this.languageId == rhs.languageId)||((this.languageId!= null)&&this.languageId.equals(rhs.languageId)))&&((this.sourceCode == rhs.sourceCode)||((this.sourceCode!= null)&&this.sourceCode.equals(rhs.sourceCode))))&&((this.stdin == rhs.stdin)||((this.stdin!= null)&&this.stdin.equals(rhs.stdin))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(languageId);
        dest.writeValue(sourceCode);
        dest.writeValue(stdin);
    }

    public int describeContents() {
        return  0;
    }

}
