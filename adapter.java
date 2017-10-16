package sabra.muscledetector;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class adapter extends ArrayAdapter <String> {
    Context context;
    String[] muscles;
    int[] images;

    public adapter(Context context,String[] muscles,int[] images){
        super(context,R.layout.activity_muscle_selection,muscles);
        this.context=context;
        this.muscles=muscles;
        this.images=images;

    }

    @Override
    public View getDropDownView(int position, View convertView, @NonNull ViewGroup parent) {
                LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View row= inflater.inflate(R.layout.activity_model,null);

                TextView t1=(TextView) convertView.findViewById(R.id.nameTv);
                ImageView i1= (ImageView) convertView.findViewById(R.id.imageView);

                //set data
                t1.setText(muscles[position]);
                i1.setImageResource(images[position]);

        return convertView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView==null){
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView= inflater.inflate(R.layout.activity_model,null);
        }
        TextView nameTv=(TextView) convertView.findViewById(R.id.nameTv);
        ImageView img= (ImageView) convertView.findViewById(R.id.imageView);

        //set data
        nameTv.setText(muscles[position]);
        img.setImageResource(images[position]);

        return convertView;
    }
}
