import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bernardo.recyclerview.R;

/**
 * Created by Bernardo on 31/10/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder{
    public TextView nameTextView;
    public Button messageButton;

    public ViewHolder(View itemView) {
        super(itemView);
        nameTextView = (TextView) itemView.findViewById(R.id.contact_name);
        messageButton = (Button) itemView.findViewById(R.id.message_button);
    }
}
