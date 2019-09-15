${name?cap_first}
${brand?upper_case}
${brand?length}
${words?replace("blood","*****")}
${words?index_of("blood")}
<#--三目运算-->
${(words?index_of("blood")!=-1)?string("包含敏感词汇","不包含敏感词汇")}
<#--四舍五入，上取整，下取整-->
${n?round}
${n?floor}
${n?ceiling}
公司共有${computers?size}台电脑
第一台${computers?first.model}
最后一台${computers?last.model}
<#--按价格排序，reverse反转排序-->
<#list computers?sort_by("price")?reverse as c>
    ${c.sn}-${c.price}
</#list>
