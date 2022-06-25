import { DataState } from "../enum/data.state.enum";

export interface AppState<N>{

    dataState: DataState;
    appData?: N;
    error? : string;

}