package com.java.sprint8;

public class TEST13 {

    /*this class contains all json annotataions and its use cases
    * @JsonIgnore:
    * Use Case: When you want to exclude a specific field from being serialized and deserialized.
    * public class User {
    private String name;

    @JsonIgnore
    private String password;

    // getters and setters
}

*
*
*
* @JsonIgnoreProperties:

Use Case: When you want to exclude multiple fields at the class level.
*
* @JsonIgnoreProperties({"password", "email"})
public class User {
    private String name;
    private String password;
    private String email;

    // getters and setters
}

*
*
*
*
* @JsonProperty:

Use Case: When you want to change the JSON property name for a field.
*
* public class User {
    @JsonProperty("user_name")
    private String name;

    private String password;

    // getters and setters
}

*
*
*
*@JsonInclude:

Use Case: When you want to include only non-null or non-empty fields in the JSON output.
*
* public class User {
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;

    // getters and setters
}

*
*
*
* @JsonFilter:

Use Case: When you need dynamic filtering of JSON properties at runtime.
*
* @JsonFilter("userFilter")
public class User {
    private String name;
    private String password;
    private String email;

    // getters and setters
}

    *
    *
    *
    * @JsonFormat	Specify a custom format for date/time fields.
    *@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date eventDate;
    *
    *
    *
    *
    *@JsonIgnoreType	Ignore an entire type during serialization.	@JsonIgnoreType public class InternalClass { ... }
    *The @JsonIgnoreType annotation in Jackson is used to ignore an entire type during serialization and deserialization. When you annotate a class with @JsonIgnoreType, any property of that type in another class will be ignored in the JSON output.

Use Case
This annotation is particularly useful when you have a complex object graph and you want to exclude certain types from being serialized, often because they are internal or contain sensitive information that should not be exposed in the JSON representation.
    *
    *
    *
    *
@JsonPropertyOrder	Specify the order of properties in the JSON output.	@JsonPropertyOrder({"name", "email", "age"}) public class User { ... }
*
*
*
@JsonUnwrapped	Unwrap values of a property and include them as top-level properties in the JSON output.	@JsonUnwrapped private Address address;
*
*
*
*
@JsonRootName	Define a custom root name for the JSON output when using root wrapping.	@JsonRootName(value = "user") public class User { ... }
*
*
*
*
@JsonSerialize	Specify a custom serializer for a field.	@JsonSerialize(using = CustomSerializer.class) private String customField;
*
*
*
*
@JsonDeserialize	Specify a custom deserializer for a field.	@JsonDeserialize(using = CustomDeserializer.class) private String customField;
*
*
*
*
@JsonCreator	Indicate a constructor or factory method to use for deserialization.	@JsonCreator public User(@JsonProperty("name") String name,
*
*
*
*
* @JsonProperty("age") int age) { ... }
*
*
*
*
@JsonAnySetter	Use a method to handle all unknown properties during deserialization.	@JsonAnySetter public void set(String name, Object value) { ... }
*
*
*
@JsonAnyGetter	Use a method to get a map of all properties that do not have explicit getters.	@JsonAnyGetter public Map<String, Object> any() { ... }
*
*
*
*
@JsonView	Serialize a field only when a specific view is active.	@JsonView(Views.Public.class) private String name;
*
*
*
*
@JsonIdentityInfo	Handle circular references by using an identifier.	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id") private List<User> friends;
*
*
*
*
@JsonManagedReference	Handle forward part of reference (parent) when dealing with bidirectional relationships.	@JsonManagedReference private List<Address> addresses;
*
*
*
*
@JsonBackReference	Handle back part of reference (child) when dealing with bidirectional relationships.	@Json
    *
    * */

}
