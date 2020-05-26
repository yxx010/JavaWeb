<#list computers as c>
List的序号：${c_index+1}
SN:${c.sn}
型号:${c.model}
<#if c.state==1>
状态:正在使用
<#elseif c.state==2>
状态:闲置
    <#elseif c.state==3>
状态:已作废
    </#if>
    <#if c.user??>
用户:${c.user}
    </#if>
采购时间:${c.dop?string("yyyy年MM月dd日")}
采购价格:${c.price?string("0.00")}

</#list>
=================================
<#--获取key集-->
<#list c_map?keys as k>
${k}-${c_map[k].model}
</#list>