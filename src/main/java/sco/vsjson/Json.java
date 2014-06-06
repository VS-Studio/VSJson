/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sco.vsjson;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Administrator
 */
public class Json {
    
    public static String parse(Object o, Class tpl)
    {
        printMap(fields(o, tpl));
        return null;
    }
    
    public static Object toObj(String s, Class tpl)
    {
        
        return null;
    }
    
    

    private static Map fields(Object o, Class cls)
    {
        Field[] fields = cls.getDeclaredFields();
        Map datas = new HashMap();
        if(fields != null && fields.length > 0)
        {
            for(Field field: fields)
            {
                try {
                    datas.put(field.getName(), field.get(o));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        return datas;
    }
    
    
    private static void printMap(Map m)
    {
        if(m != null)
        {
            Iterator it =m.entrySet().iterator();
            while(it.hasNext())
            {
                Entry en = (Entry)it.next();
                
                System.out.println("" + en.getKey() + ":" + en.getValue());
            }
        }
    }
}
