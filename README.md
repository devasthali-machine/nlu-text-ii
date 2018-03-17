alexas-uncle
------------

templating example

template example
----------------

```
{
"displayText" : "${displayText}",
"items": [
    <#assign items_count = items?size>
    <#list items as i>
        {
          "id": ${i_index + 1},
          "name" : "${i}"
        }<#if i_index != items_count - 1>,</#if>
    </#list>
    ]
}
```

template response
-----------------

```
$ cat responses/purchase.json
{
"displayText" : "Welcome to Alexas uncle",
"items": [
        {
          "id": 1,
          "name" : "umbrella"
        },
        {
          "id": 2,
          "name" : "tv"
        },
        {
          "id": 3,
          "name" : "walkmen"
        }
    ]
}
```
