package io.swagger.client.model.agreements;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * FormFieldGenerator
 *
 * @author Ambi
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-3T15:48:52.659+05:30")
public class FormFieldGenerator {

    @SerializedName("formFieldDescription")
    private List<FormField> formFieldDescription = null;

    @SerializedName("formFieldNamePrefix")
    private String formFieldNamePrefix = null;

    @SerializedName("generatorType")
    private String generatorType  = null;

    @SerializedName("participantSetName")
    private String participantSetName = null;

//    @SerializedName("anchorTextInfo ")
//    private AnchorTextInfo anchorTextInfo  = null;

    @SerializedName("linked")
    private Boolean linked  = null;

    public List<FormField> getFormFieldDescription() {
        return formFieldDescription;
    }

    public void setFormFieldDescription(List<FormField> formFieldDescription) {
        this.formFieldDescription = formFieldDescription;
    }

    public String getFormFieldNamePrefix() {
        return formFieldNamePrefix;
    }

    public void setFormFieldNamePrefix(String formFieldNamePrefix) {
        this.formFieldNamePrefix = formFieldNamePrefix;
    }

    public String getGeneratorType() {
        return generatorType;
    }

    public void setGeneratorType(String generatorType) {
        this.generatorType = generatorType;
    }

    public String getParticipantSetName() {
        return participantSetName;
    }

    public void setParticipantSetName(String participantSetName) {
        this.participantSetName = participantSetName;
    }

    public Boolean getLinked() {
        return linked;
    }

    public void setLinked(Boolean linked) {
        this.linked = linked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(formFieldDescription, formFieldNamePrefix, generatorType, participantSetName, linked);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FormFieldGenerator {\n");

        sb.append("    formFieldDescription: ").append(toIndentedString(formFieldDescription)).append("\n");
        sb.append("    formFieldNamePrefix: ").append(toIndentedString(formFieldNamePrefix)).append("\n");
        sb.append("    generatorType: ").append(toIndentedString(generatorType)).append("\n");
        sb.append("    participantSetName: ").append(toIndentedString(participantSetName)).append("\n");
        sb.append("    linked: ").append(toIndentedString(linked)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
