module gates(a,b,c,t0,t1,t2); 
    input a,b,c; 
    output t0,t1,t2; 
    
    and ag(t0,a,b); 
    or og(t1,a,b); 
    not notg(t2,c); 
endmodule 

module testbench; 
    reg a,b,c; 
    wire t0,t1,t2; 
    
    gates g(a,b,c,t0,t1,t2); 
    
    initial begin
        $dumpfile("gates.vcd"); 
        $dumpvars(0,testbench); 
        
        a = 1'b0; b = 1'b0; c = 1'b0;
        #20 a = 1'b0; b = 1'b1; c = 1'b0;
        #20 a = 1'b1; b = 1'b0; c = 1'b0;
        #20 a = 1'b1; b = 1'b1; c = 1'b0;
        #20 a = 1'b0; b = 1'b0; c = 1'b1;
        #20 a = 1'b0; b = 1'b0; c = 1'b0;
        #20 $finish;
    end
    
    initial begin
        $monitor("Time=%0t a=%b b=%b c=%b | t0(AND)=%b t1(OR)=%b t2(NOT)=%b", 
                 $time, a, b, c, t0, t1, t2);
    end
endmodule