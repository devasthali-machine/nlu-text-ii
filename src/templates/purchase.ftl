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