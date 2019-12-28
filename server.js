var http=require("http");
serv=http.createServer(function(req,resp)
{
   resp.write("He disat ahe ka Pritam??");
   resp.end("Sang mala");
});
serv.listen(3000);
console.log("server running at port 3000");