<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

</head>

<body>
<div class="box box-primary">
    <div class="box-header with-border">
        <h3 class="box-title">Bank Transaction</h3>

        <div class="text-left">
            Name: Bhaskar Singh
        </div>



    </div>

    <div class="box-body">
        <div class="row">
            <div class="col-md-12">
                <a href="http://127.0.0.1:8085/credio"
                   class="btn btn-danger">Explore it yourself</a>
                <br/>
                %{--<g:each in="${accountDTOList}" var="account">--}%
                <div class="box box-success collapsed-box">
                    <div class="box-header with-border">
                        <div class="box-title">
                            <table class="table table-condensed">
                                <tr>
                                    <td><b>Account Number:</b></td>
                                    <td><b>Account Name:</b></td>
                                    <td><b>Sort Code:</b></td>
                                </tr>
                            </table>
                        </div>

                        <div class="box-tools pull-right">
                            <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-plus"></i>
                            </button>
                        </div>
                    </div>

                    <div class="box-body">
                        <div class="row">
                            %{--<g:if test="${account?.transactionDTOs}">--}%
                            <div class="col-md-12">
                                <table class="table table-condensed">
                                    <tr>
                                        <td><b>Available Balance:</b>${personalScrapDTO?.availableBalance}</td>
                                        <td><b><i>Other Credit:</i></b>${account?.totalOtherCredits}</td>
                                        <td><b><i>Other Debit:</i></b>${account?.totalOtherDebits}</td>
                                    </tr>
                                </table>
                            </div>

                            <div class="col-md-12">
                                <table class="table table-bordered table-hover">
                                    <th>Category</th>
                                    <th>Tags</th>
                                    <th>Amount Credit</th>
                                    <th>Amount Debit</th>
                                    <th>Date</th>
                                    <th>Description</th>



                                </table>
                            </div>

                            <div class="callout callout-danger">
                                <h4>Transactions</h4>

                                <p>There is no transaction record in this account</p>
                            </div>

                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
