# Unit Testing Documentation template

```
A retail support system manages an inventory of items. 
Each item has a descriptor and the number of available items.

```

```
public class Item { 
    private String itemCode 
    private String description; 
    private String name;
}

```

```
public class Inventory{
    public void addItem(Item i) throws ItemAlreadyExists
    public Item searchItem(String itemCode) throws ItemNotExists;  
    public int availabilityItem(String itemCode) throws ItemNotExists;  
    public void subtractItem(String itemCode) throws ItemNotExists, ItemNotAvailable;
    public void addQtyToItem(String itemCode, int qty_to_add) throws ItemNotExists;
    public void subtractQtyToItem (String itemCode, int qty_to_subtract) throws ItemNotExists, ItemNotAvailable; 
}
```

# Black Box Unit Tests

## Method addItem

<br>
<br>

**Criteria for method $addItem$:**
	

- Validity of Item object
- Existence of Item object

<br>
<br>

**Predicates for method $addItem$:**

| Criterion                | Predicate |
| ------------------------ | --------- |
| Validity of Item object  | Valid     |
|                          | NULL      |
| Existence of Item object | Yes       |
|                          | No        |

<br>
<br>

**Boundaries for method $addItem$**:

| Criterion | Boundary values |
| --------- | --------------- |
|           |                 |

<br>
<br>

 **Combination of predicates for method $addItem$**



| Validity of Item object | Existence of Item object | Valid/Invalid | Description of the test case: example of input and output    | JUnit test case |
| ----------------------- | ------------------------ | ------------- | ------------------------------------------------------------ | --------------- |
| Valid                   | Yes                      | Invalid       | Item i1 = {i1, 0, "a", "a"}<br />addItem(i1);<br />addItem(i1);<br /><br />-> ItemAlreadyExists thrown |                 |
| ''                      | No                       | Valid         | Item i1 = {i1, 0, "a", "a"}<br />addItem(i1);<br /><br />-> Item added successfully |                 |
| NULL                    | *                        | Invalid       | T3(NULL; error)                                              |                 |

<br>
<br>


## Method searchItem

<br>
<br>

**Criteria for method $searchItem$:**
	

- Validity of the String parameter
- Length of the String
- Existence of Item object

<br>
<br>

**Predicates for method $searchItem$:**

| Criterion                        | Predicate |
| -------------------------------- | --------- |
| Validity of the String parameter | Valid     |
|                                  | NULL      |
| Length of the String             | > 0       |
|                                  | = 0 ("")  |
| Existence of Item object         | Yes       |
|                                  | No        |

<br>
<br>

**Boundaries for method $searchItem$**:

| Criterion | Boundary values |
| --------- | --------------- |
|           |                 |

<br>
<br>

 **Combination of predicates for method $searchItem$**



| Validity of the String parameter | Length of the String | Existence of Item object | Valid/Invalid | Description of the test case: example of input and output    | JUnit test case |
| -------------------------------- | -------------------- | ------------------------ | ------------- | ------------------------------------------------------------ | --------------- |
| Valid                            | >0                   | Yes                      | Valid         | Item i1 = {i1, 0, "a", "a"}<br />addItem(i1);<br />searchItem("i1");<br /><br />-> item returned |                 |
| ''                               | ''                   | No                       | Invalid       | searchItem("i1")<br /><br />-> ItemNotExists                 |                 |
| *                                | 0                    | *                        | Invalid       | T3(""; error)                                                |                 |
| NULL                             | *                    | *                        | Invalid       | T4(NULL; error)                                              |                 |

<br>
<br>





## Method availabilityItem

<br>
<br>

**Criteria for method $availabilityItem$:**
	

- Validity of the String parameter
- Length of the String
- Existence of Item object

<br>
<br>

**Predicates for method $availabilityItem$:**

| Criterion                        | Predicate |
| -------------------------------- | --------- |
| Validity of the String parameter | Valid     |
|                                  | NULL      |
| Length of the String             | > 0       |
|                                  | = 0 ("")  |
| Existence of Item object         | Yes       |
|                                  | No        |

<br>
<br>

**Boundaries for method $availabilityItem$**:

| Criterion | Boundary values |
| --------- | --------------- |
|           |                 |

<br>
<br>

 **Combination of predicates for method $availabilityItem$**



| Validity of the String parameter | Length of the String | Existence of Item object | Valid/Invalid | Description of the test case: example of input and output    | JUnit test case |
| -------------------------------- | -------------------- | ------------------------ | ------------- | ------------------------------------------------------------ | --------------- |
| Valid                            | >0                   | Yes                      | Valid         | Item i1 = {i1, 0, "a", "a"}<br />addItem(i1);<br />availabilityItem("i1");<br /><br />-> availability of the item returned |                 |
| ''                               | ''                   | No                       | Invalid       | availabilityItem("i1")<br /><br />-> ItemNotExists           |                 |
| *                                | 0                    | *                        | Invalid       | T3(""; error)                                                |                 |
| NULL                             | *                    | *                        | Invalid       | T4(NULL; error)                                              |                 |


<br>
<br>


### Method subtractItem

<br>
<br>

**Criteria for method $subtractItem$:**
	

- Validity of the String parameter
- Length of the String
- Existence of Item object
- Availability of Item object

<br>
<br>

**Predicates for method $subtractItem$:**

| Criterion                        | Predicate               |
| -------------------------------- | ----------------------- |
| Validity of the String parameter | Valid                   |
|                                  | NULL                    |
| Length of the String             | > 0                     |
|                                  | = 0 ("")                |
| Existence of Item object         | Yes                     |
|                                  | No                      |
| Availability of Item object      | Yes (availability >= 1) |
|                                  | No (availability = 0)   |

<br>
<br>

**Boundaries for method $subtractItem$**:

| Criterion                   | Boundary values |
| --------------------------- | --------------- |
| Availability of Item object | 0,1             |

<br>
<br>

 **Combination of predicates for method $subtractItem$**



| Validity of the String parameter | Length of the String | Existence of Item object | Availability of Item object | Valid/Invalid | Description of the test case: example of input and output | JUnit test case |
| -------------------------------- | -------------------- | ------------------------ | --------------------------- | ------------- | --------------------------------------------------------- | --------------- |
| Valid                            | >0                   | Yes                      | >= 1                        | Valid         | T0 -> availability returned                               |                 |
| ''                               | ''                   | Yes                      | =0                          | Invalid       | T1 -> throws ItemNotAvailable                             |                 |
| ''                               | ''                   | No                       | -                           | Invalid       | T2 -> throws ItemNotExists                                |                 |
| *                                | 0                    | -                        | -                           | Invalid       | T3(""; error)                                             |                 |
| NULL                             | -                    | -                        | -                           | Invalid       | T4(NULL; error)                                           |                 |

<br>
<br>



### Method addQtyToItem

<br>
<br>

**Criteria for method $addQtyToItem$:**
	

- Validity of the String parameter
- Length of the String
- Existence of Item object
- Availability of Item object
- Sign of the qty_to_add parameter

<br>
<br>

**Predicates for method $addQtyToItem$:**

| Criterion                        | Predicate |
| -------------------------------- | --------- |
| Validity of the String parameter | Valid     |
|                                  | NULL      |
| Length of the String             | > 0       |
|                                  | = 0 ("")  |
| Existence of Item object         | Yes       |
|                                  | No        |
| Sign of the qty_to_add_parameter | >=0       |
|                                  | <0        |

<br>
<br>

**Boundaries for method $addQtyToItem$**:

| Criterion                        | Boundary values |
| -------------------------------- | --------------- |
| Availability of Item object      | 0,1             |
| Sign of the qty_to_add_parameter | 0,1             |

<br>
<br>

 **Combination of predicates for method $addQtyToItem$**



| Validity of the String parameter | Length of the String | Existence of Item object | Sign of the qty_to_add parameter | Valid/Invalid | Description of the test case: example of input and output | JUnit test case |
| -------------------------------- | -------------------- | ------------------------ | -------------------------------- | ------------- | --------------------------------------------------------- | --------------- |
| Valid                            | >0                   | Yes                      | <0                               | Invalid       | T0 -> error                                               |                 |
| ''                               | ''                   | ''                       | >=0                              | Valid         | T1 -> availability added                                  |                 |
| ''                               | ''                   | No                       | -                                | Invalid       | T2 -> throws ItemNotExists                                |                 |
| *                                | 0                    | -                        | -                                | Invalid       | T3(""; error)                                             |                 |
| NULL                             | -                    | -                        | -                                | Invalid       | T4(NULL; error)                                           |                 |



<br>
<br>



### Method subtractQtyToItem

<br>
<br>

**Criteria for method $subtractQtyToItem$:**
	

- Validity of the String parameter
- Length of the String
- Existence of Item object
- Availability after subtraction
- Sign of the qty_to_add parameter

<br>
<br>

**Predicates for method $subtractQtyToItem$:**

| Criterion                        | Predicate |
| -------------------------------- | --------- |
| Validity of the String parameter | Valid     |
|                                  | NULL      |
| Length of the String             | > 0       |
|                                  | = 0 ("")  |
| Existence of Item object         | Yes       |
|                                  | No        |
| Sign of the qty_to_add_parameter | >=0       |
|                                  | <0        |
| Availability after subtraction   | <0        |
|                                  | >=0       |

<br>
<br>

**Boundaries for method $subtractQtyToItem$**:

| Criterion                        | Boundary values |
| -------------------------------- | --------------- |
| Availability of Item object      | 0,1             |
| Sign of the qty_to_add_parameter | 0,1             |

<br>
<br>

 **Combination of predicates for method $subtractQtyToItem$**



| Validity of the String parameter | Length of the String | Existence of Item object | Sign of the qty_to_add parameter | Availability after subtraction | Valid/Invalid | Description of the test case: example of input and output | JUnit test case |
| -------------------------------- | -------------------- | ------------------------ | -------------------------------- | ------------------------------ | ------------- | --------------------------------------------------------- | --------------- |
| Valid                            | >0                   | Yes                      | <0                               | *                              | Invalid       | T0 -> error                                               |                 |
| ''                               | ''                   | ''                       | >=0                              | <0                             | Invalid       | T1 -> throw ItemNotAvailable                              |                 |
| ''                               | ''                   | ''                       | ''                               | >=0                            | Valid         | T2 -> availability subtracted                             |                 |
| ''                               | ''                   | No                       | -                                | -                              | Invalid       | T3 -> throws ItemNotExists                                |                 |
| *                                | 0                    | -                        | -                                | -                              | Invalid       | T4(""; error)                                             |                 |
| NULL                             | -                    | -                        | -                                | -                              | Invalid       | T5(NULL; error)                                           |                 |

