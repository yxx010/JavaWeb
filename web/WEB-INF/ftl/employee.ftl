<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>员工列表</title>
    <link href="../css/bootstrap.css" type="text/css" rel="stylesheet">
    <style type="text/css">
        .pagination {
            margin: 0px
        }

        .pagination > li > a, .pagination > li > span {
            margin: 0 5px;
            border: 1px solid #dddddd;
        }

        .glyphicon {
            margin-right: 3px;
        }

        .form-control[readonly] {
            cursor: pointer;
            background-color: white;
        }

        #dlgPhoto .modal-body {
            text-align: center;
        }

        .preview {

            max-width: 500px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="row">
        <h1 style="text-align: center">IMOOC员工信息表</h1>
        <div class="panel panel-default">
            <div class="clearfix panel-heading ">
                <div class="input-group" style="width: 500px;">
                    <!--button class="btn btn-primary" id="btnAdd"><span class="glyphicon glyphicon-zoom-in"></span>新增
                    </button-->
                </div>
            </div>

            <table class="table table-bordered table-hover">
                <thead>
                <tr class="panel-heading">
                    <th>序号</th>
                    <th>员工编号</th>
                    <th>姓名</th>
                    <th>部门</th>
                    <th>职务</th>
                    <th>工资</th>
                </tr>
                </thead>
                <tbody>
                <#list employee_list as emp>
                    <tr>
                        <td>${emp_index+1}</td>
                        <td>${emp.no?string("0")}</td>
                        <td>${emp.name}</td>
                        <td>${emp.department}</td>
                        <td>${emp.job}</td>
                        <td style="color: red">￥${emp.salary?string("0.00")}</td>
                    </tr>
                </#list>

                </tbody>
            </table>
        </div>
    </div>
</div>



</body>
</html>